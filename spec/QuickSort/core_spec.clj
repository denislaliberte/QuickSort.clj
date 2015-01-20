(ns quicksort.core-spec
  (:require [speclj.core :refer :all]
            [quicksort.core :refer :all]))

(describe "Quicksort"
  (it "return an empty list"
    (should= '() (quicksort '())))
  (it "return one element array"
    (should= '(1) (quicksort '(1))))
  (it "sort three element array"
  (pending)
    (should= '(3,2,1) (quicksort '(1,2,3))))
)
