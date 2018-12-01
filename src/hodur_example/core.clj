(ns hodur-example.core
  (:require [hodur-engine.core :as hodur]
            [hodur-lacinia-schema.core :as hodur-lacinia]))

(def meta-db (hodur/init-schema
              '[^{:lacinia/tag-recursive true}
                Person
                [^String first-name
                 ^String last-name]]))

(def lacinia-schema (hodur-lacinia/schema meta-db))

lacinia-schema
