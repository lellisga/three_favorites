(ns three-favorites.helpers.response)

(defn keyword-params [params]
  "Gets a hash-map and sets the keyword to the
  hash-map keys"
  (into {}
        (for [[k, v] params]
          [(keyword k) v])))
