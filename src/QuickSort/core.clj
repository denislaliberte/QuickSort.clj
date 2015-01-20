(ns quicksort.core)

(defn quicksort "it return a list sorted" [a]
  a
)

(defn filter-less [a,b] 
  (filter #(< % b) a )
)

