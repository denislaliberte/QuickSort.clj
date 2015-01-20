(ns quicksort.core)

(defn filter-compare [list compare value]
  (filter #(compare % value) list)
)

(defn quicksort "it return a list sorted" [a]
  (cond (<= (count a) 1)
    a
  :else 
    (let [pivot (first a)]
      (lazy-cat 
        (quicksort (filter-compare a < pivot)) 
        (filter-compare a = pivot) 
        (quicksort (filter-compare a > pivot))
      )
    )
  )
)

