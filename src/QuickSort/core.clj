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
  (let [pivot (first a)]
    (concat (filter-less a pivot) (filter-equal a pivot) (filter-more a pivot))
  )
)

