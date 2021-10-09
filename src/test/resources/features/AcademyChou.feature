@stories
    Feature: Academy Choucair
    As an user, I want to learn how to automate in screamplay at the Choucair Academy with the
    automation course
    @scenerio1
    Scenario: Search for a automation course
      Given that Rose want to learn automation at the Academy choucair
        | strUser    | strPassword   |
        | 1065855423  | Choucair2021* |

      When she search for the course on the Choucair Academy
        |strCourse              |
        |Metodología Bancolombia|

      Then she finds the course
        |strCourse              |
        |Metodología Bancolombia|


