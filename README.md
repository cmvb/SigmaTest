# SigmaTest
Proyecto Prueba de desarrollo Sigma

# Instrucciones de ejecución
En la carpeta Sigma se encuentra el front de la prueba. Desarrollado en Angular Vs. 9.1.4
En la carpeta SigmaBackend se encuentra el back de la prueba. Desarrollado en SpringBoot / Java 1.8 / ApiREST

# Front
Opción 1.
-(Se requiere AngularCli y NodeJS) Ir a la raiz del proyecto y ejecutar desde consola el siguiente comando: "npm start"
- El aplicativo queda desplegado por defecto en el puerto 4200
-> URL Front: http://localhost:4200/#/dashboard

Opción 2.
- Generar el compilado de distribución o productiva con el siguiente comando: "ng build --prod"
- Copiar el contenido de la carpeta dist generada y desplegar en algún servidor

Nota: Es importante tener en cuenta que en el archivo proxy.conf.json del proyecto está configurado para comunicarse con un backend en un despliegue local de la siguiente forma (Modificar si es necesario):
{
    "/sigma-test/*": {
        "target": "http://localhost:9002",
        "secure": false,
        "changeOrigin": true
    }
}

# Backend
- Abrir el proyecto con apoyo de algún IDE. De preferencia usar Spring Tool Suite (STS)
- Ubicar el archivo "SigmaApplication" y realizar el despliegue o el debug.
- (Opcional) Por defecto está trabajando sobre un servidor tomcat en el puerto 8080. En el archivo de propiedades puede modificar el servidor de despliegue. 
- Las URL's de los servicios desplegados para consumo desde el front son:

-> Consulta del JSON de Departamentos y Ciudades // urlGeoPoliticoSigma = 'http://localhost:8080/sigma-test/geo';
-> Creación del registro de contacto // urlCrearContactoSigma = 'http://localhost:8080/sigma-test/geo/createContact';

