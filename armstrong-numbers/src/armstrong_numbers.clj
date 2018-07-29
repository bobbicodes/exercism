(ns armstrong-numbers)

(defn digits [n]
  (map #(Integer/parseInt (str %))  (seq (str n))))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn numdigits [n]
  (count (digits n)))

(defn multiplier [n]
  (map #(exp % (numdigits n)) (digits n)))

(defn adder [n]
  (reduce + (multiplier n)))

(defn armstrong? [n]
  (= (adder n) n))
