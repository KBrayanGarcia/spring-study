
Configurar variables de entorno (.env)
===================================

Explicación para preparar las variables de entorno y usar/depurar la aplicación desde VS Code. Usa el archivo de ejemplo [/.env.example](.env.example) como referencia.

1) Crear el archivo `.env` en la raíz del proyecto (misma carpeta que `pom.xml`):

   - Copia el contenido de `/.env.example` y ajusta los valores necesarios. Ejemplo mínimo (ya provisto en `/.env.example`):

   ```env
   APP_NAME=crud-basico
   H2_CONSOLE_ENABLED=true
   ...
   ```

2) Añadir/editar `launch.json` desde VS Code (recomendado):

   1. Abre el menú **Run and Debug** (Depurar) en VS Code.
   2. Haz clic en **Add Configuration...** o en la opción para abrir/editar `launch.json` — esto generará el archivo si no existía.
   3. Localiza la configuración que usarás (por ejemplo `CrudBasicoApplication`) y añade la propiedad `envFile` apuntando a `${workspaceFolder}/.env`.

   Ejemplo:

   ```json
   {
     "type": "java",
     "name": "CrudBasicoApplication",
     "request": "launch",
     "mainClass": "crud.basico.crud_basico.CrudBasicoApplication",
     "projectName": "crud-basico",
     "envFile": "${workspaceFolder}/.env"
   }
   ```

   > Nota: la propiedad correcta es `envFile`.

3) Ejecutar / Depurar desde VS Code

   - Después de añadir `envFile`, abre el panel **Run and Debug**, selecciona la configuración `CrudBasicoApplication` y pulsa Play (iniciar) o inicia el depurador.

   - Si no tenías `launch.json`, la opción **Add Configuration...** en el menú de Debug te permite crearla fácilmente y agregar la entrada anterior.

4) Seguridad

   - No agregues `.env` al control de versiones si contiene credenciales reales. Si procede, añade `.env` a `.gitignore`.

Referencias:

- Archivo de ejemplo: [/.env.example](.env.example)
- Inicio rápido: [README.md](README.md)

