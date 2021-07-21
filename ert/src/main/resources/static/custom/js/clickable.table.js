function rowClicked(route, param) {
	location.href = (location.href.slice(0, location.href.lastIndexOf(route) + route.length) + "/" + param);
}