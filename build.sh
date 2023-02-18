echo "==================== > maven clean and package"
./mvnw clean package
echo "==================== > docker build"
docker image build -t user-service-h2 .
echo "==================== > docker run"
docker run -p 9003:9003 user-service-h2