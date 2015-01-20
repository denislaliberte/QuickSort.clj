(ns quicksort.core-spec
  (:require [speclj.core :refer :all]
            [quicksort.core :refer :all]))

(describe "Quicksort"
  (it "return an empty list"
    (should= '() (quicksort '())))
  (it "return one element array"
    (should= '(1) (quicksort '(1))))
  (it "sort three element array"
    (should= '(1,2,3) (quicksort '(2,3,1)))
    (should= '(10,20,30) (quicksort '(20,30,10)))
  )
  (it "sort recursively"
    (should= '(1,2,3,4,5,6,7) (quicksort '(7,4,5,6,3,2,1)))
  )
)

