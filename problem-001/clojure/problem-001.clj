(defn sum-divisible-3-5
  "Find the sum of all the multiples of 3 or 5 below 1000"
  []
  (loop
      [limit 999
       result 0]
    (if (zero? limit)
      result
      (recur (dec limit)
             (if
                 (or (zero? (mod limit 3)) (zero? (mod limit 5)))
               (+ limit result)
               result)))))
             
