(ns clojure-format-example)

(defn foo
  [bar]
  (cond (nil? bar)
        true

        (zero? bar)
        true

        :else
        bar))

(defn bar []
  (do (prn "fi")
      (prn "fo")
      (prn "fum")))
