import Keycloak from 'keycloak-js';

const keycloak = new Keycloak({
  url: 'http://localhost:8080',
  realm: 'text-to-learn',
  clientId: 'frontend-client',
});

export default keycloak;
