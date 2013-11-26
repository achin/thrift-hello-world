(ns thrift-hello-world.server
  (:require [thrift-clj.core :as thrift])
  (:gen-class))

(thrift/import
  (:services echo.EchoService))

(thrift/defservice echo-service
  EchoService
  (echo [msg]
    msg))

(defn -main [& [host port]]
  (if (and host port)
    (let [port (Integer/parseInt port)]
      (println "Listening on host" host "and port" port)
      (thrift/serve-and-block!
        (thrift/single-threaded-server
          echo-service port
          :bind host
          :protocol :compact)))
    (println "You must specify a host and port to bind to!") ))
