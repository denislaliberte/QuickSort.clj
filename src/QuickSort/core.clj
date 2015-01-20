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
  (cond (<= (count a) 1)
    a
  :else 
    (let [pivot (first a)]
      (concat (quicksort (filter-less a pivot)) (filter-equal a pivot) (quicksort (filter-more a pivot)))
    )
  )
)

