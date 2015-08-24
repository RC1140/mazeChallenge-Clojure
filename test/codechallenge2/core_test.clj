(ns codechallenge2.core-test
  (:require [clojure.test :refer :all]
            [codechallenge2.core :refer :all]))

(deftest can-find-start
    (is (= [0 1]
           (find-start mazeTest))))

(deftest can-find-end
    (is (= [19 18]
           (find-end mazeTest))))
