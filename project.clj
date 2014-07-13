(defproject friend-form-login "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [com.cemerick/friend "0.2.1"]
                 [ring "1.3.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler friend-form-login.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
