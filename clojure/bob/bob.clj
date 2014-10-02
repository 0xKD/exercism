(ns bob
  (:require [clojure.string :as str]))

(defn response-for [call]
  (if (str/blank? call) "Fine. Be that way!"
    (if (= call (str/upper-case call)) "Woah, chill out!"
      (if (= \? (.charAt call (- (.length call) 1))) "Sure." "Whatever."))))
