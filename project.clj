(defproject thrift-hello-world "0.1.0-SNAPSHOT"
  :description "Simple hello world Thrift client and server"
  :url "https://github.com/achin/thrift-hello-world"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [thrift-clj "0.2.0"]
                 [ch.qos.logback/logback-classic "1.0.13"]]
  :java-source-paths ["target/thrift-java"]
  :plugins [[lein-thriftc "0.1.0"]]
  :prep-tasks ["thriftc"])
