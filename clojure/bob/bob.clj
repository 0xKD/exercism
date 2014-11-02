(ns bob
  (:require [clojure.string :as str]))

(defn response-for [call]
  (if (str/blank? call) "Fine. Be that way!"
    (if (and (every? #(or (not (Character/isLetter %))
                     (Character/isUpperCase %))
                call)
             (not (not-any? #(Character/isLetter %) call)))
      "Woah, chill out!"
      (if (= \? (.charAt call (- (.length call) 1))) "Sure."
        "Whatever."
      )
    )
  )
)
