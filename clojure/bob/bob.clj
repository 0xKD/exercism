(ns bob
  (:require [clojure.string :as str]))

(defn response-for [call]
  (if (str/blank? call) "Fine. Be that way!"
    (if (= \? (.charAt call (- (.length call) 1))) "Sure."
      (if (every? #(or (not (Character/isLetter %))
                       (Character/isUpperCase %))
              call) "Woah, chill out!" "Whatever."
        )
      )
    )
  )
