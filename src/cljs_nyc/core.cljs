(ns cljs-nyc.core)

(.log js/console "Hello!")

(def node (.getElementById js/document "app"))

(def cljs-set #{})
(def js-set (js/Set. (into-array (range 1e6))))

(println "JS Set" (. js-set -size))
(dotimes [_ 10]
  (time
    (dotimes [_ 1e6]
      (contains? js-set 500000))))

(println "CLJS Set")
(dotimes [_ 10]
  (time
    (dotimes [_ 1e6]
      (contains? cljs-set node))))