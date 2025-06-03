(ns cljs-nyc.core
  #_(:require [domina.css :refer [sel]]
            [domina.events :as events])
  (:import [goog.date DateTime Interval]
           [goog.i18n DateTimeFormat]))

(.log js/console "Hello!")

#_(def f (DateTimeFormat. "EEEE MMMM d, y"))

#_(let [week (Interval. nil nil 7)
      dt   (DateTime.)]
  (.add dt week)
  (.log js/console (.format f dt)))

#_(events/listen! (sel "ul li") :click
    (fn [e]
      (.log js/console (-> e events/raw-event .-target))))
