# calculation-app-backend

Entwickleraufgabe

Um eine neue Rechenregel hinzuzufügen, sind folgende Schritte notwendig:

1. Beispiel Rechenregel aus "exampleRule.json" in "calculationRules.json" nach der letzten Rechenregel einfügen
2. Neue Rechenregel mit fortlaufender ID (siehe ID der letzten Regel in "calculationRules.json") versehen und
   Attribute (name, description, inputs, calculationRule, variables und ruleAsCode) auf neue Rechenregel anpassen.
3. ruleAsCode muss nach den Standards der "net.objecthunter.exp4j" library eingefügt werden. Für weitere Infos
   siehe: https://www.objecthunter.net/exp4j/
4. "calculationRules.json" speichern

Um eine Rechenregel anzupassen sind folgende Schritte notwendig:

1. Zu bearbeitende Rechenregel in "calculationRules.json" suchen und nach Belieben anpassen (json Format ist hierbei zu
   beachten)
2. Falls "ruleAsCode" angepasst werden soll, muss diese nach den Standards der "net.objecthunter.exp4j" library
   angepasst werden. Für weitere Infos siehe: https://www.objecthunter.net/exp4j/
3. "calculationRules.json" speichern

Um eine Rechenregel zu löschen sind folgende Schritte notwendig:

1. "calculationRules.json" öffnen und Rechenregel aus "calculationRule"-Array entfernen.
2. "calculationRules.json" speichern