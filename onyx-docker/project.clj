(defproject xl-onyx "0.1.0-SNAPSHOT"
  :description ""
  :url ""
  :license {:name ""
            :url ""}
  :dependencies [[aero "1.0.3"]
                 [org.clojure/clojure "1.9.0-beta3"]
                 [org.clojure/tools.cli "0.3.5"]
                 [org.onyxplatform/onyx "0.11.1"]
                 [org.onyxplatform/lib-onyx "0.11.1.0"]]
  :source-paths ["src"]

  :profiles {:dev {:jvm-opts ["-XX:-OmitStackTraceInFastThrow"]
                   :global-vars {*assert* true}
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [lein-project-version "0.1.0"]]}

             :uberjar {:aot [lib-onyx.media-driver
                             xl-onyx.core]
                       :uberjar-name "peer.jar"
                       :global-vars {*assert* false}}})
