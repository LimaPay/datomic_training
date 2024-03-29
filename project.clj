(defproject day-of-datomic "1.0.0-SNAPSHOT"
  :description "Sample Code for Day of Datomic Presentation"
  :plugins [[lein-tg "0.0.1"]]
  :jvm-opts ["-Xmx1g" "-server"]
  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [org.clojure/test.generative "0.3.0"]
                 [com.datomic/datomic-free "0.9.5153"]
                 [incanter/incanter-charts "1.3.0"]
                 [incanter/incanter-pdf "1.3.0"]])
