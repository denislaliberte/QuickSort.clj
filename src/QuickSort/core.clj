(ns quicksort.core)

(defn quicksort "it return a list sorted" [a]
  a
)

(defn filter-less [a,b] 
  (filter #(< % b) a )
)

(defn filter-more [a,b] 
  (filter #(> % b) a )
)

(defn filter-equal [a,b] 
  (filter #(= % b) a )
)
