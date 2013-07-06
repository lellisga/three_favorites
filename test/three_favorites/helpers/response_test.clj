(ns three-favorites.helpers.response-test
  (:require [clojure.test :refer :all]
            [three-favorites.helpers.response :as response-helper]))

(deftest keyword-params-test
  (is (=
       (response-helper/keyword-params {})
       {}))

  (is (= 
        (response-helper/keyword-params {"one" "uno"})
       {:one "uno"}))
  
  (is (=
       (response-helper/keyword-params {:one "uno"})
       {:one "uno"})))

