(ns series)

(defn digits [n]
  (map #(Integer/parseInt (str %))  (seq (str n))))

(defn slices [string length]
  (cond
    (empty? string) []
    (= 0 length) [""]
    (< (count string) (count (digits length))) []
    (= (count string) length) (vector string)
    :else (apply map str (partition length 1 (digits (read-string string))))))
