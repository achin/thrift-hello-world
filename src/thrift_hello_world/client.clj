(ns thrift-hello-world.client
  (:require [thrift-clj.core :as thrift])
  (:gen-class))

(thrift/import
  (:clients echo.EchoService))

(defn -main [& [host port msg]]
  (if (and host port msg)
    (let [port (Integer/parseInt port)]
      (println "Connecting to " host "on" port)
      (with-open [c (thrift/connect! EchoService [host port])]
        (println "->" (EchoService/echo c msg))))
    (println "You must specify a host and port to connect to and a message to send!") ))
