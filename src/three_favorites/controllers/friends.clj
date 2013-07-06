(ns three-favorites.controllers.friends
  (:require [three-favorites.helpers.template :as templates]
            [ring.util.response :refer [response]]))

(defn friends-page [request]
  (response (templates/friends-page (:form-params request))))
