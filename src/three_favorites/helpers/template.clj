(ns three-favorites.helpers.template
  (:require [clojure.java.io :as io]
            [comb.template :as comb]
            [three-favorites.helpers.response :refer [keyword-params]]))

(defn load-template [location vars]
  (comb/eval
    (slurp (io/resource location)) (keyword-params vars)))

(defn home-page-template [vars]
  (load-template "templates/index.html" vars))

(defn friends-page [vars]
  (load-template "templates/friends.html" vars))
