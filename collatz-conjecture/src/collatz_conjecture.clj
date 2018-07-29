(ns collatz-conjecture)

(defn collatz-step [num step]
  (cond
   (= num 1) step
   (even? num) (collatz-step (/ num 2) (inc step))
   (odd? num) (collatz-step (inc (* num 3)) (inc step))))

(defn collatz [num]
  (collatz-step num 0))
