(ns three-favorites.routes
  (:require
    [io.pedestal.service.http.body-params :as body-params]
    [io.pedestal.service.http.route.definition :refer [defroutes]]
    [io.pedestal.service.http :as bootstrap]
    ;; [io.pedestal.service.http.route :as route]
    ;;
    ;; Controllers
    [three-favorites.controllers.home :as home-controller]
    [three-favorites.controllers.friends :as friends-controller]))

;; You can use this fn or a per-request fn via io.pedestal.service.http.route/url-for
;; (def url-for (route/url-for-routes routes))

(defroutes routes
  [[["/" {:get home-controller/home-page}
     ["/friends" {:post friends-controller/friends-page}]
     ^:interceptors [(body-params/body-params) bootstrap/html-body]]]])
