(ns three-favorites.controllers.home
  (:require [three-favorites.helpers.template :as templates]
            [ring.util.response :refer [response]]))

(defn home-page [request] 
  (response (templates/home-page-template {})))
