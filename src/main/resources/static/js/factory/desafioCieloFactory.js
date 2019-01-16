desafioCieloApp.factory('desafioCieloFactory', ['$http','$q',
	function($http, $q) {
	
		function AllowAccesServiceAPI() {
	        $http.defaults.headers.common['Access-Control-Allow-Origin'] = '*';
	        $http.defaults.headers.post['dataType'] = 'json';
	        $http.defaults.headers.post['Content-Type'] = 'application/json';
	    }
	
	    var _buscaLancamentosConta = function() {
	    	AllowAccesServiceAPI();
	    	return  $http.get("/v1/lancamentos");
	    }
	    
	    return {
	    	buscaLancamentosConta: _buscaLancamentosConta
        }
		
	} 
]);