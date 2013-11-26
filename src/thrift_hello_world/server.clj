(ns thrift-hello-world.server
  (:require [thrift-clj.core :as thrift])
  (:gen-class))

(thrift/import
  (:services echo.EchoService))

(thrift/defservice echo-service
  EchoService
  (echo [msg]
    msg))

(defn -main [& [port]]
  (if port
    (let [port (Integer/parseInt port)]
      (println "Listening on port" port)
      (thrift/serve-and-block!
        (thrift/single-threaded-server
          echo-service port
          :bind "0.0.0.0"
          :protocol :compact)))
    (println "You must specify a port to bind to!") ))
