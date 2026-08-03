## Comandos básicos de Git ⬇️

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

## Configuración de Git ⬇️

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

## Historial y Estado ⬇️

```bash
git status ✅
# Muestra el estado actual del repositorio.

git log --oneline ✅
# Muestra el historial de commits en una sola línea por cada uno.

git log --oneline --graph --all ✅
# Muestra el historial de commits gráficamente y en todas las ramas.
```

## Revisión de Cambios ⬇️

```bash
git diff ✅
# Compara los cambios en el archivo con el último commit. Muestra qué líneas se agregaron (verde) o eliminaron (rojo) antes de hacer git add.

git diff --staged ✅
# Compara los archivos en el staging area frente al último commit. Muestra lo que está listo para el commit.

git diff HEAD ✅
# Compara todo el proyecto (con y sin 'git add') con el último commit.
```

## Restaurar Cambios ⬇️

```bash
git restore --staged main.js ✅
# Quita un archivo del staging area (deshace un 'git add').

git restore main.js ✅
# Deshace los cambios locales y deja el archivo como estaba en el último commit.
# Solo funciona si el archivo no está en el staging area.
```

## Guardar cambios temporalmente (Stash) ⬇️

```bash
git stash ✅
# Guarda temporalmente todos tus cambios no guardados en un "cajón" y deja tu proyecto limpio.

git stash pop ✅
# Saca los cambios del "cajón" y los vuelve a aplicar en tu código actual.
```

## Vincular repositorio remoto y subir cambios ⬇️

```bash
git remote add origin https://github.com/tu_usuario/tu_repo.git ✅
# Conecta tu proyecto local con un repositorio remoto (GitHub).

git push -u origin main ✅
# Sube por primera vez tu rama local 'main' al repositorio remoto y la vincula.

git push ✅
# Sube tus cambios locales (commits) al repositorio remoto.
# Solo funciona si ya está vinculada la rama con el remoto.
```

## Clonar y actualizar repositorios ⬇️

```bash
git clone https://github.com/usuario/repositorio.git ✅
# Copia un repositorio remoto a tu computadora.
# Debes hacerlo desde git bash en una carpeta vacía.

git fetch ✅
# Descarga los cambios del repositorio remoto (GitHub) pero NO los fusiona automáticamente. Es seguro para revisar.

git pull ✅
# Descarga y fusiona los últimos cambios del repositorio remoto con tu rama actual.
```

## Ramas (branches) ⬇️

```bash
git checkout -b login ✅
# Crea una nueva rama 'login' y cambia a ella.

git branch ✅
# Muestra todas las ramas locales y resalta la rama actual.

git checkout main ✅
# Cambia a la rama 'main'.

git push --set-upstream origin login ✅
# Sube la nueva rama 'login' al remoto y la vincula para futuros push/pull.
```

## Fusionar y eliminar ramas ⬇️

```bash
git merge login ✅
# Fusiona la rama 'login' con tu rama actual (debes estar en 'main').

git branch -d login ✅
# Elimina la rama local 'login' si ya fue fusionada.

git branch -D login ✅
# Elimina la rama local 'login' forzadamente, sin importar si fue fusionada.

git push origin --delete login ✅
# Elimina la rama 'login' del repositorio remoto (GitHub).
# Para eliminar una rama desde git hub, damos click en view all branches y la borramos.
```

## Pull Request (PR) desde GitHub ⬇️

```bash
⭕¿Para qué sirve un Pull Request (PR)?
Permite fusionar los cambios hechos en una rama (como 'login') hacia otra (como 'main') con una revisión previa.
Es ideal para trabajar en equipo, permitiendo revisar, comentar o aprobar antes de integrar.

⭕Pasos para hacerlo desde la web de GitHub:
1. Ve a tu repositorio en GitHub y selecciona tu rama.
2. Haz clic en "Compare & pull request" (o ve a "Pull requests" > "New pull request").
3. Asegúrate de que la rama base sea 'main' y la rama a comparar sea tu rama de trabajo.
4. Agrega un título, una descripción y haz clic en "Create pull request".
5. Una vez aprobado, haz clic en "Merge pull request" para fusionarlo y elimina la rama.
```

## ¿Qué es un Fork? ⬇️

```bash
⭕¿Qué es un Fork?
Es una copia de un repositorio ajeno alojada en tu propia cuenta de GitHub. 
Te permite experimentar o colaborar en proyectos de otros sin afectar el original.

⭕Pasos para hacerlo:
1. Ve al repositorio original en GitHub y haz clic en el botón "Fork" (arriba a la derecha).
2. GitHub creará una copia exacta en tu cuenta personal.
3. Clona tu propio fork a tu computadora usando:
git clone https://github.com/tu_usuario/nombre-del-repo.git

⭕Diferencia clave con 'git clone':
- Un Fork te permite enviar 'Pull Requests' directos al dueño del proyecto original.
- Un 'git clone' simple descarga el proyecto, pero no te vincula para proponer cambios oficiales si no eres colaborador.
```