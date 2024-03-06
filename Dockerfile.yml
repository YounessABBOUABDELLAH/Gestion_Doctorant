FROM python:latest

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Installer les dépendances Python nécessaires
RUN pip install --no-cache-dir Flask

# Copier le reste des fichiers de l'application dans le conteneur
COPY . .

# Exposer le port sur lequel Flask s'exécute
EXPOSE 5000

# Commande pour exécuter l'application Flask
CMD ["python", "test.py"]
