FROM postgres:15

ENV POSTGRES_USER=admin
ENV POSTGRES_PASSWORD=admin123
ENV POSTGRES_DB=default_db

COPY init-db.sql /docker-entrypoint-initdb.d/

EXPOSE 5000
