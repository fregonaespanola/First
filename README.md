# Realización del proyecto First
Realización del proyecto first en conjunto con la aplicación realizada en figma "Foodier".

## Splash Screen - Pantalla de inicio

En la [pantalla de inicio](./app/src/main/res/layout/activity_splash.xml) podemos encontrar poca cosa, ya que es una pantalla simple, sin embargo, podemos observar que cuenta con una imgen de fondo de unos cupcakes, extraída de 
[unsplash](https://unsplash.com/photos/fa59muUjyec) y con un TextView por encima el cual ocupa toda la pantalla el cual es del color principal de la aplicación con la peculiaridad
del atributo alpha para poder modificar la opacidad. A su vez también dispone del logo de la propia aplicación centrado en medio de la pantalla y justo debajo otro TextView con el
nombre de la aplicación con una "FontFamily" descargada desde el propio Android Studio, denominada [Amaranth_bold](./app/src/main/res/font/amaranth_bold.xml).

Después trasladándonos al [Proyecto Java](./app/src/main/java/com/dgarcia/first/Splash.java) podemos observar que hay varias animaciones creadas enlazadas todas con "Handler().postDelayed"
para poder añadir un delay y que no se ejecuten todas a la vez, de modo que quede un movimiento en el logo más "smooth". También la imagen de fondo sacada de [unsplash](https://unsplash.com/photos/fa59muUjyec)
se declara en este Java para optimizar recursos y seguidamente un método para que se abra la aplicación transcurridos 5 segundos.


![IMAGEN DE TEXTOS](./img/splashscreenshot.png)

## Ventana de Login - Inicio de sesión

En la acitividad XML del Login denominada [LoginActivity](./app/src/main/res/layout/loginactivity.xml) podemos encontrar en primera instancia que no tiene un color sólido como fondo,
sino que tiene añadido un [gradiente](./app/src/main/res/drawable/gradient.xml) con distintas tonalidades de rojos (saturadas y con mayor luminosidad). Seguidamente encontramos el logo,
y a raíz de el mismo se realizarán los distintos posicionamientos de los demás items que encontraremos. Seguidamente encontramos dos textfields que actúan como inputs para poder introducir
tanto nuestro nombre como nuestra contraseña mediante un EditText, y tienen la peculiaridad de que en la parte izquierda de estos campos contienen una imagen (en este caso predeterminada de
Android Studio) la cual se introduce gracias al atributo "startIconDrawable" en el text field. La contraseña a su vez cuenta con el atributo "passwordToggleEnabled" para poder ver lo que estamos
escribiendo de contraseña o no (ya depende del usuario).

Seguidamente, nos encontramos con los botones de Login (el cual acciona el método "openMain" si se clickea) y el botón Cancelar. Y después, encontramos un TextView por si no tenemos una cuenta
creada poder acceder a la actividad [SignUp](./app/src/main/res/layout/signupactivity.xml) mediante su click. Y por último unos márgenes seguros para poder centrar los items.

Otra peculiaridad, es que también contamos con [la vista en horizontal de este layout](./app/src/main/res/layout-land/loginactivity.xml), que nos permite