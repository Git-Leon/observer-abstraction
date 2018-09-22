

# Define interface Observable
* Define abstract interface in the `com.zipcodewilmington.observerpattern.utils` package named `Observable`.
* Declare non-static method named `registerObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`
* Declare non-static method named `removeObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`
* Declare non-static method named `notifyObservers`, which has a return type of type `void` and nullary parameters
* Declare non-static method named `getObservers`, which has a return type of type `Observer[]` and nullary parameters
* Declare non-static method named `notifyObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`

# Define interface DisplayElement
* Define abstract interface in the `com.zipcodewilmington.observerpattern.utils` package named `DisplayElement`.
* Declare non-static method named `display`, which has a return type of type `void` and nullary parameters

# Define class Publisher
* Define abstract class in the `com.zipcodewilmington.observerpattern.utils` package named `Publisher`.
* Declare non-static method named `update`, which has a return type of type `void` and nullary parameters
* Define non-static method named `update`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Update`
* Declare non-static field named `observable` of type `Class`. The field has `private` accessibility.

# Define class WeatherDataSubject
* Define concrete class in the `com.zipcodewilmington.observerpattern` package named `WeatherDataSubject`.
* Define non-static method named `notifyObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`
* Define non-static method named `notifyObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.weatherstation.WeatherDataPublisher`
* Define non-static method named `setTemperature`, which has a return type of type `void` and a parameter of type `java.lang.Float`
* Define non-static method named `getTemperature`, which has a return type of type `float` and nullary parameters
* Define non-static method named `getHumidity`, which has a return type of type `float` and nullary parameters
* Define non-static method named `setHumidity`, which has a return type of type `void` and a parameter of type `java.lang.Float`
* Define non-static method named `getPressure`, which has a return type of type `float` and nullary parameters
* Define non-static method named `setPressure`, which has a return type of type `void` and a parameter of type `java.lang.Float`
* Declare non-static field named `weatherData` of type `Class`. The field has `private` accessibility.

# Define interface Update
* Define abstract interface in the `com.zipcodewilmington.observerpattern.utils` package named `Update`.
* Declare non-static method named `execute`, which has a return type of type `void` and nullary parameters

# Define class CurrentConditionsDisplay
* Define concrete class in the `com.zipcodewilmington.observerpattern.weatherstation.display` package named `CurrentConditionsDisplay`.
* Define non-static method named `display`, which has a return type of type `void` and nullary parameters

# Define class WeatherData
* Define concrete class in the `com.zipcodewilmington.observerpattern` package named `WeatherData`.
* Define non-static method named `setTemperature`, which has a return type of type `void` and a parameter of type `float`
* Define non-static method named `getTemperature`, which has a return type of type `float` and nullary parameters
* Define non-static method named `getHumidity`, which has a return type of type `float` and nullary parameters
* Define non-static method named `setHumidity`, which has a return type of type `void` and a parameter of type `float`
* Define non-static method named `getPressure`, which has a return type of type `float` and nullary parameters
* Define non-static method named `setPressure`, which has a return type of type `void` and a parameter of type `float`
* Declare non-static field named `temperature` of type `Class`. The field has `private` accessibility.
* Declare non-static field named `humidity` of type `Class`. The field has `private` accessibility.
* Declare non-static field named `pressure` of type `Class`. The field has `private` accessibility.

# Define class WeatherDataUpdate
* Define concrete class in the `com.zipcodewilmington.observerpattern` package named `WeatherDataUpdate`.

# Define class MainApplication
* Define concrete class in the `com.zipcodewilmington` package named `MainApplication`.
* Define static method named `main`, which has a return type of type `void` and a parameter of type `java.lang.String[]`

# Define class Subject
* Define abstract class in the `com.zipcodewilmington.observerpattern.utils` package named `Subject`.
* Define non-static method named `registerObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`
* Define non-static method named `removeObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`
* Define non-static method named `notifyObservers`, which has a return type of type `void` and nullary parameters
* Define non-static method named `getObservers`, which has a return type of type `Observer[]` and nullary parameters
* Declare non-static method named `notifyObserver`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`
* Define static method named `lambda$getObservers$1`, which has a return type of type `Observer[]` and a parameter of type `int`
* Define non-static method named `lambda$notifyObservers$0`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Observer`
* Declare non-static field named `observers` of type `ParameterizedTypeImpl`. The field has `private` accessibility.

# Define class WeatherDataPublisher
* Define concrete class in the `com.zipcodewilmington.observerpattern` package named `WeatherDataPublisher`.
* Define non-static method named `update`, which has a return type of type `void` and nullary parameters
* Define static method named `lambda$update$0`, which has a return type of type `void` and nullary parameters
* Declare non-static field named `weatherData` of type `Class`. The field has `private` accessibility.

# Define class StatisticsDisplay
* Define concrete class in the `com.zipcodewilmington.observerpattern.weatherstation.display` package named `StatisticsDisplay`.
* Define non-static method named `display`, which has a return type of type `void` and nullary parameters

# Define class ObserverDisplayElement
* Define abstract class in the `com.zipcodewilmington.observerpattern.utils` package named `ObserverDisplayElement`.
* Define non-static method named `update`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Update`

# Define class ThirdPartyDisplay
* Define concrete class in the `com.zipcodewilmington.observerpattern.weatherstation.display` package named `ThirdPartyDisplay`.
* Define non-static method named `display`, which has a return type of type `void` and nullary parameters

# Define class ForecastDisplay
* Define concrete class in the `com.zipcodewilmington.observerpattern.weatherstation.display` package named `ForecastDisplay`.
* Define non-static method named `display`, which has a return type of type `void` and nullary parameters

# Define interface Observer
* Define abstract interface in the `com.zipcodewilmington.observerpattern.utils` package named `Observer`.
* Declare non-static method named `update`, which has a return type of type `void` and a parameter of type `com.zipcodewilmington.observerpattern.utils.observer.Update`