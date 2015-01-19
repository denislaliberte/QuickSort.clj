(ns quicksort.core-spec
  (:require [speclj.core :refer :all]
            [quicksort.core :refer :all]))

(describe "Quicksort"
  (it "return an empty list"
    (should= '() (quicksort '())))
)
