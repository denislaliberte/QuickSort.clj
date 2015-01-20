(ns quicksort.core)

(defn filter-less [a,b] 
  (filter #(< % b) a )
)

(defn filter-more [a,b] 
  (filter #(> % b) a )
)

(defn filter-equal [a,b] 
  (filter #(= % b) a )
)
(defn quicksort "it return a list sorted" [a]
    (concat (filter-less a 2) (filter-equal a 2) (filter-more a 2))
)

