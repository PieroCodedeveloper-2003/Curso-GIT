## Comandos básicos de Git

```bash
git init ✅
# Inicia un nuevo repositorio Git en tu proyecto.

git add main.js ✅
# Agrega un archivo específico al staging area.

git add . ✅
# Agrega todos los archivos modificados al staging area.

git commit -m "Mensaje que explica el cambio" ✅
# Guarda en el historial los cambios añadidos al staging area.
```

## Configuración de Git

```bash
git config --global user.name "Tu Nombre" ✅
# Establece tu nombre de autor global para todos los commits.

git config user.name ✅
# Muestra el nombre configurado actualmente.

git config --global user.email "Tu email" ✅
# Establece tu email global para todos los commits.

git config user.email ✅
# Muestra el email configurado actualmente.
```

## Historial y Estado

```bash
git status ✅
# Muestra el estado actual del repositorio.

git log --oneline ✅
# Muestra el historial de commits en una sola línea por cada uno.

git log --oneline --graph --all ✅
# Muestra el historial de commits gráficamente y en todas las ramas.
```

## Restaurar Cambios

```bash
git restore --staged main.js ✅
# Quita un archivo del staging area (deshace un 'git add').

git restore main.js ✅
# Deshace los cambios locales y deja el archivo como estaba en el último commit.
# Solo funciona si el archivo no está en el staging area.
```

## Vincular repositorio remoto y subir cambios

```bash
git remote add origin https://github.com/tu_usuario/tu_repo.git ✅
# Conecta tu proyecto local con un repositorio remoto (GitHub).

git push -u origin master ✅
# Sube por primera vez tu rama local 'master' al repositorio remoto y la vincula.

git push ✅
# Sube tus cambios locales (commits) al repositorio remoto.
# Solo funciona si ya está vinculada la rama con el remoto.
```

## Clonar y actualizar repositorios

```bash
git clone https://github.com/usuario/repositorio.git ✅
# Copia un repositorio remoto a tu computadora.
# Debes hacerlo desde git bash en una carpeta vacía.

git pull ✅
# Descarga y fusiona los últimos cambios del repositorio remoto con tu rama actual.
```

## Ramas (branches)

```bash
git checkout -b login ✅
# Crea una nueva rama 'login' y cambia a ella.

git branch ✅
# Muestra todas las ramas locales y resalta la rama actual.

git checkout master ✅
# Cambia a la rama 'master'.

git push --set-upstream origin login ✅
# Sube la nueva rama 'login' al remoto y la vincula para futuros push/pull.
```

## Fusionar y eliminar ramas

```bash
git merge login ✅
# Fusiona la rama 'login' con tu rama actual (debes estar en 'master').

git branch -d login ✅
# Elimina la rama local 'login' si ya fue fusionada.

git branch -D login ✅
# Elimina la rama local 'login' forzadamente, sin importar si fue fusionada.

git push origin --delete login ✅
# Elimina la rama 'login' del repositorio remoto (GitHub).
# Para eliminar una rama desde git hub, damos click en view all branches y la borramos.
```

## Pull Request (PR) desde GitHub

```bash
1. Ve a tu repositorio en GitHub y selecciona la rama login.
2. Haz clic en "Compare & pull request", o también puedes ir a la pestaña "Pull requests" y hacer clic en "New pull request".
3. Compara tu rama login con la rama base master. Asegúrate que base sea master y compare sea login.
4. Haz clic en "Create pull request".
5. Agrega un título y una descripción (opcional) que expliquen los cambios.
6. Haz clic en "Merge pull request" para fusionar los cambios de login hacia master.
7. (Opcional) Elimina la rama login si ya no la necesitas.
💡 ¿Para qué sirve un Pull Request (PR)?
Permite fusionar los cambios hechos en una rama (como login) hacia otra (como master), con una revisión previa.
Es muy útil cuando trabajas en equipo, ya que otros pueden revisar, comentar o aprobar los cambios antes de integrarlos.
```

## Limpieza de ramas remotas eliminadas

```bash
git remote prune origin ✅
# Elimina de tu Git local las referencias de ramas remotas que ya no existen en GitHub.
```

## Conflictos en Git y GitHub

```bash
Ocurren cuando dos ramas modifican el mismo archivo (o línea).
Ejemplo:
- Tu compañero hace un PR a la rama master y cambia application.properties.
- Tú también haces cambios en el mismo archivo en tu rama login.
- Al intentar hacer merge/PR, GitHub detecta el conflicto.
💡 GitHub mostrará un aviso: "This branch has conflicts that must be resolved".
➡️ Haz clic en "Resolve conflicts", edita el archivo manualmente, guarda (Mark as resolved) y confirma el merge.
```

## Traer y fusionar cambios del remoto

```bash
git pull origin master ✅
# Descarga y fusiona los últimos cambios de la rama 'master' del remoto con tu rama local actual.
# Es útil para mantener la rama actual actualizada y evitar conflictos al hacer un git push o Pull Request (PR).

git fetch origin master ✅
# Solo descarga los últimos cambios de la rama 'master' del remoto (no los fusiona).
# Luego puedes aplicar los cambios con: git merge origin master

⚠️ Recomendación:
- Si hiciste git fetch, primero haz el merge antes de hacer commits locales, para evitar conflictos.
✅ Pero si tus cambios están en archivos distintos a los del remoto, puedes hacer commit sin problema antes del merge.
```

## Eliminar historial anterior y conservar solo el commit actual

```bash
git reset --soft $(git commit-tree HEAD^{tree} -m "Nuevo inicio") ✅
# Elimina todos los commits anteriores y crea un nuevo commit con el estado actual del proyecto.
# Deja el repositorio como si este fuera el primer commit (nuevo inicio de historial).
# No borra archivos ni cambios, solo resetea el historial de commits.
# ⚠️ Solo se debe usar solo si NO has hecho push, o si vas a forzar el push luego.
```

## Forzar subida de cambios al remoto (sobrescribir historial)

```bash
git push origin master --force ✅
# Sube tu commit actual al repositorio remoto (por ejemplo GitHub) de forma forzada.
# ⚠️ Sobrescribe el historial del remoto con el nuevo historial local (como si fuera el nuevo inicio).
# ⚠️ Peligroso si trabajas en equipo, ya que borra los commits anteriores del remoto.
# Solo se debe usar si estás seguro de que quieres reemplazar completamente el historial remoto.
```

## ¿Qué es un Fork?
```bash
Un fork es una copia de un repositorio que se guarda en tu cuenta de GitHub.  
Te permite hacer cambios libremente sin afectar el proyecto original.  
Es ideal cuando quieres colaborar con un proyecto externo.

Pasos para hacer un fork:
1. Ve al repositorio original en GitHub que deseas copiar.
2. Haz clic en el botón "Fork" (parte superior derecha).
3. GitHub creará una copia del repositorio en tu cuenta personal.
4. Clona tu fork en tu computadora:
git clone https://github.com/tu_usuario/nombre-del-repo.git ✅

## Diferencia entre fork y git clone

- Si haces un fork y luego aplicas cambios, puedes enviar un Pull Request.
- El dueño del repositorio original podrá ver tus cambios y decidir si los acepta.
- Si solo haces git clone, no puedes enviar Pull Request directamente,
  ya que no tienes una copia vinculada al original en tu cuenta.
```

## Guardar cambios temporales con Git Stash
```bash
git stash ✅
# Guarda temporalmente los cambios no confirmados (no comiteados) de tu rama actual.
# Útil si necesitas cambiar de rama pero no quieres perder tu trabajo.

git stash list ✅
# Muestra la lista de cambios guardados con stash.

git stash apply ✅
# Recupera el último stash guardado y aplica los cambios a tu rama actual.

git stash pop ✅
# Aplica el último stash guardado y lo elimina de la lista.

git stash drop ✅
# Elimina un stash guardado (por defecto el más reciente).

git stash clear ✅
# Elimina todos los stash guardados.
```
