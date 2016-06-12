**Plan de manejo de las configuraciones (CM_Plan)**
-------------------------------------------
Grupo Mate - Ingeniería en Software - UNC
Author(s): Bado, Ignacio – Alecha, Gonzalo
Document Version: 1.0.0

---------------------------------
# Indice
- [Revisión Historica](#revisión-histórica)
- [1. Introducción](#1-introducción)
	- [1.1. Herramientas de Configuration Management](#11-herramientas-de-configuration-management)
	- [1.2 Formas de acceso](#12-formas-de-acceso) 
- [2. Roles de gestión de configuraciones](#2-roles-de-gestión-de-configuraciones)
	- [2.1 Responsabilidades de gestión de configuraciones](#21-responsabilidades-de-gestión-de-configuraciones)
- [3. Gestión de cambios](#3-gestión-de-cambios)
	- [3.1 Alcance](#31-alcance)
	- [3.2 Junta de control de cambios (TCCB)](#32-junta-de-control-de-cambios)
		- [3.2.1 Miembros](#321-miembros)
- [4. Esquema de Directorios](#4-esquema-de-directorios)
- [5. Normas de etiquetado](#5-normas-de-etiquetado)
- [6. Plan de esquemas de ramas a usar](#6-plan-de-esquemas-de-ramas-a-usar)
	- [6.1 Políticas de fusión](#61-políticas-de-fusión)
- [7. Entrega de releases](#7-entrega-de-releases)

--------------------------


Revisión Histórica
-------------
| Versión  | Fecha |Descripción                                        |
|----------|-----|----------------------------------------------------|
| 1.0.0      | 12/06/16 |Funcionalidades principales del juego            |
| 1.1.0      | 17/06/16|      Mejoras estéticas     |
| 2.0.0    |19/05/16| Mejora en la vista del tiempo a traves del BeatBar                     |


------------

1. Introducción
------------

 
Este documento tiene objetivo cubrir el Plan de gestión de las configuraciones para el proyecto correspondiente al trabajo final de Ingenieria en Software. 
En este plan, se definirán todos los pasos a seguir por los integrantes del proyecto como también se especificarán los elementos del proyecto que estarán bajo administración de configuraciones.

####1.1. Herramientas de Configuration Management

| Herramienta | 	Propósito	 |	Controles                                       |
|-------------|---------------|----------------------------------------------------|
| Git     | Software de control de versiones, seguimiento de defectos, entre otras. |Uso de funciones Branch y Merge para desarrollo de código en paralelo.                            |
| GitHub      | Plataforma de desarrollo colaborativo de software para alojar proyectos utilizando el sistema de control de versiones Git|Uso de repositores, etiquetado, control de  tareas y control de lanzamientos.           |
| Travis CI   |Sistema de integración continua compatible con GitHub, utilizado para verificar el código fuente del proyecto automáticamente.| Enlazado automático con GitHub.                      |
| IntelliJ IDE   |Plataforma de software compuesto por un conjunto de herramientas de programación de código abierto multiplataforma .| Uso de editor, compilador y depurador.                   |
| TortoiseGit  |Software de control de revisiones basado en TortoiseSVN .| Uso de TortoiseGitMerge para comparar visualmente dos archivos y resolver conflictos.                    | 
####1.2 Formas de acceso

•	*Herramienta de gestión de versiones*  
La herramienta de gestión de versiones  a  utilizar es GitHub. Para acceder al repositorio del proyecto se proporciona  el siguiente link :
https://github.com/alechagonzalo/IngSoftware-2016-Mate

•	*Herramienta de integración continua*
Para la integración continua se utilizará Travis CI. Travis CI permite conectar tu repositorio de Github y probar después de cada push que hagas, regenerando el proyecto. Para acceder se lo hace mediante el siguiente enlace:
https://travis-ci.org/alechagonzalo/IngSoftware-2016-Mate

•	*Herramienta de gestión de defectos*
Para la gestión de defectos se hará uso de la herramienta Issues que proporciona GitHub. A través de ella podemos solucionar conflictos de diversos tipos, generando un nuevo Issues para cada conflico, pudiendo etiquetar a cada uno con su correspondiente categoría. 
Para acceder a la herramienta se proporciona el siguiente link:
https://github.com/alechagonzalo/IngSoftware-2016-Mate/issues


2. Roles de gestión de configuraciones
-------------------------------------

Las actividades de gestión de configuraciones del proyecto serán coordinadas por el Global Proyect Configuration Manager  (GPCM). Este rol será asignado a una persona. Además se designará un respaldo para el GPCM.
El PCM será  responsable de actividades como el segiuimiento de los branches, determinando cuando un branch será creado, que actividades de desarrollo pertenecen a cada rama, etc. 
Las actividades de gestión de configuración, procesos, procedimientos y políticas deberán ser seguidas por todos los miembros del equipo. Es la responsabilidad de cada persona para seguir y aplicar el proceso de CM de forma adecuada, de acuerdo con sus roles / funciones asignadas.
La siguiente tabla muestra las personas que tendrán la función de administradores de configuración.

| Rol  | Primario |Secundario                                |
|----------|-----|----------------------------------------------------|
| Global PCM     | Gonzalo Alecha |Ignacio Bado                             |

####2.1 Responsabilidades de gestión de configuraciones

 *Global Proyect Configuration Manager  (GPCM)*
 
-	Responsabilidad sobretodos los elementos de configuración.
-	La responsabilidad de la creación de todas las ramas y la administración de sus políticas.
-	Responsable de la aplicación de etiquetas en las principales ramas y releases.
-	Garantizar la integridad del producto y la trazabilidad de los elementos de configuración para todo el proyecto.
-	Coordinar las actividades de CM dentro del proyecto.
-	Garantizar la correcta ejecución del esquema de CM.
-	Ayudar en las actividades de combinación a la principal y liberar las ramas.
-	Participar en las auditorías

*Equipo*
-	Ayudar a resolver conflictos durante el proceso de combinación de ramas.
-	Asegurarse de que los criterios de calidad de los releases cumplan.
-	Seguir todos los procesos asociados, políticas y prácticas definidas por sus roles asignados.


3. Gestión de cambios
--------------------

#### 3.1 Alcance
La gestión de cambio es un proceso que ocurre después de identificar y aprobar la documentación, código fuente o hardware del producto de referencia. Los cambios incluyen cambios internos en el enfoque documentado original debido a la simulación o resultados de pruebas o peticiones externas de cambios en las características o funciones.

####  3.2 Junta de control de cambios
El TCCB es un comité que asegura que cada cambio se considera adecuado por todas las partes y está autorizado antes de su aplicación. El TCCB es responsable de aprobar, supervisar y controlar las solicitudes de cambio para establecer líneas de base de los elementos de configuración. El ámbito de trabajo será la de aprobar / rechazar los cambios necesarios en los planes, documentos y código. 

##### 3.2.1 Miembros

| Rol  | Primario |Forma de contacto                              |
|----------|-----|----------------------------------------------------|
| Engineering Manager - CCB Chair     | Ignacio Bado |ignaciobado.unc@gmail.com                            |
| Engineering Manager      | Gonzalo Alecha|alechagonzalo@gmail.com                             |

La CCB se reunirá ante cada solicitud de cambio de parte de los diferentes equipos del proyecto. Es obligatoria la presencia de cada uno de sus miembros para tomar las decisiones que se crean necesarias.

## 4. Esquema de Directorios ##

Para el esquema de la figura se debe respetar lo siguiente:

 - 	En la carpeta **src** se almacenará todo lo relacionado con el propio funcionamiento de la aplicación. 
	 - En la carpeta denominada **main** se guardará el código fuente principal, y en las carpeta **test**, los relacionados con las pruebas unitarias. 
	 Dentro de main estarán los archivos .java, los cuales deben comenzar en mayúscula y deben tener un significado que represente la identidad de la clase a la que pertenece.

- 	Los documentos generados se guardaran dentro de una carpeta llamada **docs** y deben estar en formato Markdown. De ésta manera 	se podrá observar el historial de cambios sobre los documentos y quien realizó cada cambio. También  contendrá diagramas relacionados al proyecto.

## 5. Normas de etiquetado ##

Para cada release se creará una etiqueta en GitHub. La nomenclatura a utilizar tendrá el siguiente patrón:

 - X.Y.Z , donde X inicia en 1 y aumentará cuando se realicen grandes cambios en la estructura del proyecto. Y se iniciará en 0, y aumentará a medida que se le agregan funcionalidades menores a una versión. Por ultimo, Z inicia en 0 y aumentará cuando se solucionen errores menores en una versión.

6. Plan de esquemas de ramas a usar
----------------------

El proyecto comenzará sobre una rama principal llamada master. De ella surgirán las ramificaciones. 
Para cada objetivo del proyecto se generará una nueva rama. El nombre de la rama generada deberá representar alguna característica del trabajo a realizar en la rama.
Por ejemplo, para que un desarrollador trabaje en un espacio aparte al principal, puede crear una rama llamada “Desarrollo”.

![](https://fbcdn-sphotos-g-a.akamaihd.net/hphotos-ak-xpt1/v/t34.0-12/13413852_10209993156649665_1703771823_n.jpg?oh=bedfa5944fe83feb55875b758cf23d80&oe=575FD9CC&__gda__=1465824084_a4e486d7832609ec3410ae54dd9da1da)

#### 6.1 Políticas de fusión 
La fusión de archivos o merge, se llevará a cabo cuando la funcionalidad desarrollada cumpla con los requisitos de un release, o cuando sea necesario incluir esta funcionalidad en la rama principal del proyecto.

7. Entrega de releases
----------------------

Cada reléase será entregado en formato ZIP, el cual tendrá un menú con instrucciones mínimas a seguir para poder instalarlo y usarlo.
