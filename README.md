# Realización del proyecto First
Realización del proyecto first en conjunto con la aplicación realizada en figma "Foodier".

## Splash Screen - Pantalla de inicio

En la pantalla de inicio podemos encontrar poca cosa, ya que es una pantalla simple, sin embargo, podemos observar que cuenta con una imgen de fondo de unos cupcakes, extraída de 
[unsplash](https://unsplash.com/photos/fa59muUjyec) y con un TextView por encima el cual ocupa toda la pantalla el cual es del color principal de la aplicación con la peculiaridad
del atributo alpha para poder modificar la opacidad. A su vez también dispone del logo de la propia aplicación centrado en medio de la pantalla y justo debajo otro TextView con el
nombre de la aplicación con una "FontFamily" descargada desde el propio Android Studio, denominada [Amaranth_bold](./app/src/main/res/font/amaranth_bold.xml).

Después trasladándonos al [Proyecto Java](./app/src/main/java/com/dgarcia/first/Splash.java) podemos observar que hay varias animaciones creadas enlazadas todas con "Handler().postDelayed"
para poder añadir un delay y que no se ejecuten todas a la vez, de modo que quede un movimiento en el logo más "smooth". También la imagen de fondo sacada de [unsplash](https://unsplash.com/photos/fa59muUjyec)
se declara en este Java para optimizar recursos y seguidamente un método para que se abra la aplicación transcurridos 5 segundos.


![IMAGEN DE TEXTOS](./img/2.PNG)

## Colores cambiados
Para los colores se realizaron dos cambios importantes, los cambios para el modo diurno y los cambios para el
modo oscuro.

Para el modo diurno procedí a realizar cambios en [values/themes.xml](https://github.com/fregonaespanola/MaterialThemeBuilder/blob/master/app/src/main/res/values/themes.xml) para cambiar el aspecto general de la aplicación,
es decir, los colores primarios y secundarios para la misma.
Seguidamente en [values/colors.xml](https://github.com/fregonaespanola/MaterialThemeBuilder/blob/master/app/src/main/res/values/colors.xml) también se realizaron cambios pero estos afectarían a ambos modos.

![IMAGEN DE COLORES DIURNOS](./img/3.PNG)

Para el modo nocturno, ví que existía una caperta llamada [values-night](./app/src/main/res/values-night/themes.xml) la cual contenía un archivo themes.xml el cual
era igual que el diurno así que procedí a realizar los cambios.

![IMAGEN DE COLORES NOCTURNOS](./img/4.PNG)

## Ramas

La única rama existente es master así que todos los cambios están realizados ahí.

## Datos para subirlo a GitHub

Por un error que desconozco no me dejaba hacer el commit desde Android Studio por lo que se tuvo que realizar
de la siguiente manera.

1. Hacer el add desde el AndroidStudio.
2. Hacer el commit desde la terminal Git Bash.
3. Volver al AndroidStudio para poder realizar el push mediante el link del repositorio.