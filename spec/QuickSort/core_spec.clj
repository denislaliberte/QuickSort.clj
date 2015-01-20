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

(describe "filter-less"
  (it "return all element of a sequence less than"
    (should= '(1) (filter-less '(1,2,3) 2))
  )
)

(describe "filter-more"
  (it "return all element of a sequence more than"
    (should= '(3) (filter-more '(1,2,3) 2))
  )
)

(describe "filter-equal"
  (it "return all element of a sequence equal to"
    (should= '(2) (filter-equal '(1,2,3) 2))
  )
)
