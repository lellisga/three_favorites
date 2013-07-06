(ns three-favorites.service
  (:require [three-favorites.routes :refer [routes]]
            [io.pedestal.service.http :as bootstrap]))

;; Consumed by three-favorites.server/create-server
(def service {:env :prod
              ::bootstrap/routes routes
              ::bootstrap/type :jetty
              ::bootstrap/port 8080})
