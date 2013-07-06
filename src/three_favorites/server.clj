(ns three-favorites.server
  (:gen-class) ; for -main method in uberjar
  (:require [three-favorites.service :as service]
            [io.pedestal.service.http :as bootstrap]))

(defonce service-instance nil)

(defn create-server
  "Standalone dev/prod mode."
  [& [opts]]
  (alter-var-root #'service-instance
                  (constantly (bootstrap/create-server (merge service/service opts)))))

(defn -main [& args]
  (create-server)
  (bootstrap/start service-instance))
