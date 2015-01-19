(defproject fizzbuzz "0.1.0-SNAPSHOT"
  :description "Fizzbuzz kata in clojure"
  :url "http://github.com/denislaliberte/fizzbuzz.clj"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[speclj "3.1.0"]]}}
  :plugins [[speclj "3.1.0"]]
  :test-paths ["spec"])
