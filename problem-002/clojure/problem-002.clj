(defn fib
[]
(loop [x 0
	y 1
	result []]
(if (>= (+ x y) 4000000)
	(reduce + result)
	(if (zero? (mod (+ x y) 2))
		(recur y (+ x y) (conj result (+ x y)))
		(recur y (+ x y) result)))))

